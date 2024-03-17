package com.example.socialpuig;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class CommentsAdapter extends RecyclerView.Adapter<CommentsAdapter.CommentViewHolder> {

    private List<Comment> commentss;

    public CommentsAdapter() {
        commentss = new ArrayList<>();
    }

    public void setComments(List<Comment> comments) {
        this.commentss = comments;
    }

    public void agregarComentario(Comment comment) {
        commentss.add(comment);
        notifyDataSetChanged(); // Notificar al adaptador que se agregó un nuevo comentario
    }

    @NonNull
    @Override
    public CommentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment, parent, false);
        return new CommentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CommentViewHolder holder, int position) {
        Comment comment = commentss.get(position);
        holder.bind(comment);
        //holder.authorTextView.setText(comment.author);
        //holder.commentTextView.setText(comment.content);
    }

    @Override
    public int getItemCount() {
        return commentss.size();
    }

    public class CommentViewHolder extends RecyclerView.ViewHolder {
        TextView authorTextView;
        TextView commentTextView;
        ImageView authorPhotoImageView;


            CommentViewHolder(@NonNull View itemView) {
                super(itemView);

                authorTextView = itemView.findViewById(R.id.authorTextView);
                commentTextView = itemView.findViewById(R.id.commentTextView);
                authorPhotoImageView = itemView.findViewById(R.id.authorPhotoImageView);
            }

        void bind(Comment comment) {
            // Establecer los datos del comentario en las vistas correspondientes
            authorTextView.setText(comment.getAuthor());
            commentTextView.setText(comment.getContent());

            // Cargar la imagen del usuario en el ImageView
            String urlFotoUsuario = comment.getUid();
            if (urlFotoUsuario != null && !urlFotoUsuario.isEmpty()) {
                Glide.with(itemView.getContext())
                        .load(urlFotoUsuario)
                        .into(authorPhotoImageView);
            } else {
                // Si no hay URL de foto de usuario válida, puedes establecer una imagen de perfil predeterminada
                authorPhotoImageView.setImageResource(R.drawable.user);
            }
        }
    }
}



import java.util.*;

public class Blog {
    private List<Post> posts;

    public Blog() {
        this.posts = new ArrayList<>();
    }

    public void adicionarPostagem(Post post) {
        for(Post p : posts) {
            if(p.getAutor().equals(post.getAutor()) && p.getTitulo().equals(post.getTitulo())) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        posts.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (Post post : posts) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new TreeMap<>();
        for (Post post : posts) {
            Categorias categoria = Categorias.valueOf(post.getCategoria().name());
            contagem.put(categoria, contagem.getOrDefault(categoria, 0) + 1);
        }
        return contagem;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postsPorAutor = new TreeSet<>();
        for (Post post : posts) {
            if (post.getAutor().equals(autor)) {
                postsPorAutor.add(post);
            }
        }
        return postsPorAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> postsPorCategoria = new TreeSet<>();
        for (Post post : posts) {
            if (post.getCategoria().equals(categoria)) {
                postsPorCategoria.add(post);
            }
        }
        return postsPorCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> postsPorCategoria = new TreeMap<>();
        for (Post post : posts) {
            Categorias categoria = post.getCategoria();
            if (!postsPorCategoria.containsKey(categoria)) {
                postsPorCategoria.put(categoria, new TreeSet<>());
            }
            postsPorCategoria.get(categoria).add(post);
        }
        return postsPorCategoria;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> postsPorAutor = new TreeMap<>();
        for (Post post : posts) {
            Autor autor = post.getAutor();
            if (!postsPorAutor.containsKey(autor)) {
                postsPorAutor.put(autor, new TreeSet<>());
            }
            postsPorAutor.get(autor).add(post);
        }
        return postsPorAutor;
    }
}

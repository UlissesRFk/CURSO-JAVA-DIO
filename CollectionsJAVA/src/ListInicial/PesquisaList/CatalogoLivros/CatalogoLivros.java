package ListInicial.PesquisaList.CatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroLista;

    public CatalogoLivros() {
        this.livroLista = new ArrayList<>();
    }

    public void addLivros(String titulo, String autor, int anoPublicacao) {
        livroLista.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarAutor(String autor) {
        List<Livro> listaPorAutor = new ArrayList<>();
        if (!livroLista.isEmpty()) {
            for (Livro l : livroLista) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    listaPorAutor.add(l);
                }
            }
        }
        return listaPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal){
        List<Livro> livrosIntervalos = new ArrayList<>();
        if(!livroLista.isEmpty()){
            for(Livro l : livroLista){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosIntervalos.add(l);
                }
            }
        }
        return livrosIntervalos;
    }

    public Livro pesquisaPorLivro(String titulo){
        Livro livroPorTitulo = null;
        if(!livroLista.isEmpty()){
            for(Livro l : livroLista){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                  livroPorTitulo = l;
                  break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.addLivros("Livro 1", "Autor 1", 2000);
        catalogoLivros.addLivros("Livro 2", "Autor 2", 2020);
        catalogoLivros.addLivros("Livro 3", "Autor 2", 2022);
        catalogoLivros.addLivros("Livro 4", "Autor 4", 2025);

        System.out.println("\n ========== Pesquisa por Autor ==========" +catalogoLivros.pesquisarAutor("Autor 2"));
        System.out.println("\n========== Pesquisa por intervalos de TEMPO ==========" + catalogoLivros.pesquisarPorIntervaloDeAnos(2000, 2021));
        System.out.println("\n========== Pesquisa por Livro ==========" + catalogoLivros.pesquisaPorLivro("Livro 4"));
    }

}

package com.example.projetospringglauco.ProdutoRepository;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.projetospringglauco.model.produtoModel;

import org.springframework.stereotype.Repository;

/**
 * ProdutoRepository
 */
@Repository
public class ProdutoRepository {

    public HashMap<Integer, produtoModel> produtos = new HashMap<>();

    public ProdutoRepository()
    {
        produtos.put(1, new produtoModel(1, "Calafrango", 10.00, 50));
        produtos.put(2, new produtoModel(2, "X-Bacon", 8.00, 20));
        produtos.put(3, new produtoModel(3, "Frango", 5.00, 30));
        produtos.put(4, new produtoModel(4, "Franqueijo", 25.00, 50));
        produtos.put(5, new produtoModel(5, "Misto", 12.00, 0));
        produtos.put(6, new produtoModel(6, "X-Burguer", 4.00, 20));
        produtos.put(7, new produtoModel(7, "Mineirinho", 15.00, 75));
        produtos.put(8, new produtoModel(8, "Cerveja corona", 20.00, 20));
        produtos.put(9, new produtoModel(9, "Coca-cola", 10.00, 80));
        produtos.put(10, new produtoModel(10, "Porção de fritas", 20.00, 10));
    }

    public produtoModel getProdutoById(int id) {
        produtoModel produtoEncontrado = produtos.get(id);
        return produtoEncontrado;
    }

    public ArrayList<produtoModel> getProdutos()
    {
        ArrayList<produtoModel> produtosArray = new ArrayList<>();
        produtosArray.addAll(produtos.values());
        return produtosArray;
    }

}
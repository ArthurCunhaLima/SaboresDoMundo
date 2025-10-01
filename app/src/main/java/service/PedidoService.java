package service;


import model.entity.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PedidoService {

    private final PedidoService pedidoService;


    public PedidoService(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    public String getPedido(List<Item> arrayPedido){
        int tamanhoPedido = arrayPedido.size();
        for (int i = 0; i < tamanhoPedido; i++){

        }

    }





}

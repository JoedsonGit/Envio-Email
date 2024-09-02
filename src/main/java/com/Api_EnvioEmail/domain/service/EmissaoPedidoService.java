package com.Api_EnvioEmail.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Api_EnvioEmail.domain.exception.PedidoNaoEncontradoException;
import com.Api_EnvioEmail.domain.model.Pedido;
import com.Api_EnvioEmail.domain.repository.PedidoRepository;

@Service
public class EmissaoPedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;


	public Pedido buscarOuFalhar(String codigoPedido) {
		return pedidoRepository.findByCodigo(codigoPedido)
			.orElseThrow(() -> new PedidoNaoEncontradoException(codigoPedido));
	}

}

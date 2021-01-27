package com.joaokennedy.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.joaokennedy.cursomc.domain.Categoria;
import com.joaokennedy.cursomc.domain.Cidade;
import com.joaokennedy.cursomc.domain.Cliente;
import com.joaokennedy.cursomc.domain.Endereco;
import com.joaokennedy.cursomc.domain.Estado;
import com.joaokennedy.cursomc.domain.ItemPedido;
import com.joaokennedy.cursomc.domain.Pagamento;
import com.joaokennedy.cursomc.domain.PagamentoComBoleto;
import com.joaokennedy.cursomc.domain.PagamentoComCartao;
import com.joaokennedy.cursomc.domain.Pedido;
import com.joaokennedy.cursomc.domain.Produto;
import com.joaokennedy.cursomc.domain.enums.EstadoPagamento;
import com.joaokennedy.cursomc.domain.enums.TipoCliente;
import com.joaokennedy.cursomc.repositories.CategoriaRepository;
import com.joaokennedy.cursomc.repositories.CidadeRepository;
import com.joaokennedy.cursomc.repositories.ClienteRepository;
import com.joaokennedy.cursomc.repositories.EnderecoRepository;
import com.joaokennedy.cursomc.repositories.EstadoRepository;
import com.joaokennedy.cursomc.repositories.ItemPedidoRepository;
import com.joaokennedy.cursomc.repositories.PagamentoRepository;
import com.joaokennedy.cursomc.repositories.PedidoRepository;
import com.joaokennedy.cursomc.repositories.ProdutoRepository;


@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{



	public static void main(String[] args) {

		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

	}

}

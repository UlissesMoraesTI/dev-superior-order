package br.com.mstechnology.order;

import br.com.mstechnology.order.entities.Order;
import br.com.mstechnology.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Autowired
	public OrderService orderService;

	@Override
	public void run(String... args) throws Exception {

		System.out.println(" ");
		Order order = new Order(1034, 150.00, 20.00);
		System.out.println("Pedido código " + order.getOrder());
		System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(order)));

		System.out.println(" ");
		Order order2 = new Order(2282, 800.00, 10.00);
		System.out.println("Pedido código " + order2.getOrder());
		System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(order2)));

		System.out.println(" ");
		Order order3 = new Order(1309, 95.90, 0.00);
		System.out.println("Pedido código " + order3.getOrder());
		System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(order3)));

	}
}

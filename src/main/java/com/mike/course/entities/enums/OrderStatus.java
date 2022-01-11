package com.mike.course.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1), 
	PAID(2), 
	SHIPPED(3), 
	DELIVERED(4), 
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() { //pra poder acessar o código
		return code;
	}
	
	//método estático pra converter o valor pro tipo enumerado
	//static pq vai funcionar sem precisar instanciar
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) { //se o meu code for igual a algum valor de status, retornar esse valor.
			if(value.getCode() == code) {
				return value;
			}
		}
		
		throw new IllegalArgumentException("Invalid OrderStatus code"); //se o numero do code não existir, lançar essa exceção.
	}	
}

package com.codeD.springCore.LifeCycle;

public class TicketBooking {
	private double ticketPrice;

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		return "TicketBooking [ticketPrice=" + ticketPrice + "]";
	}
	
	public void init() {
		System.out.println("init method running ...!");
	}
	
	public void destroy() {
		System.out.println("destroy method running ...!");
	}
}

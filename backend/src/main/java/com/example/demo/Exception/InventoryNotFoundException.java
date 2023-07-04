package com.example.demo.Exception;

public class InventoryNotFoundException extends RuntimeException {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InventoryNotFoundException(Long id) {
		super("COUND NOT FOUND THE INVENTORY WITH ID " + id);
	}

}

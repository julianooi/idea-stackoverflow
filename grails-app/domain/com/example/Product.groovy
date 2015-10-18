package com.example

/**
 * TODO: Document this
 *
 * @author Julian Ooi
 */
class Product {
	String name
	static belongsTo = [category: Category]
}

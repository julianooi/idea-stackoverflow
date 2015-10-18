package com.example

/**
 * TODO: Document this
 *
 * @author Julian Ooi
 */
class Category {
	String name

	static hasMany = [products: Product]
}

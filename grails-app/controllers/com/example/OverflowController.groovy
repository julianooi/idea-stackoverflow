package com.example

/**
 * Just a controller
 *
 * @author Julian Ooi
 */
class OverflowController {
	def index() {
		def prod = Product.get(0)

		// Stackoverflow happens here
		// prod.
	}
}

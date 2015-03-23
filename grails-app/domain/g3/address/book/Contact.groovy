package g3.address.book

class Contact {

	String name

	static constraints = {
		name blank: false, minSize: 2
	}

	String toString() {
		name
	}
}

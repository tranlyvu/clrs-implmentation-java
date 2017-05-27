# Examples 
* compiler
* dictionary implementation

# Operation 
* Insert
* Delete
* Search 

# pseudo code
## Direct access table: O(1) for all operations
	a Searching (T,k)  
		1. return T(k);
	b Inserting (T,x)
		1. T(x.key) = x;
	c Deleting (T,x)
		1. T(x.key) = null

## Hash table
	Collision resolution by chaining
		a Searching (T,k) =>worst case is O(n) when all elements in 1 slot, average is O(1)
			1. return T(h(k))
		b Inserting (T,x) =>O(1)
			1. T(h(x.key) = x;
		c Deleting (T,x) =>O(1)
			1. T(h(x.key)) = null

## Hash function
	Division method
		h(k) = k.mod m
	Multiplication method
		h(k) = floor(m(kAmod1))

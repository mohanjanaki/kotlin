import java.math.BigDecimal


fun main(args: Array<String>) {
	if(args.isEmpty()){
		print("Please Enter the order command line arguments")
		return
	}
	val orders = args[0].split("\\.|-".toRegex())
			println("Order input is: $orders")
			val orderlist = ArrayList<String>()
			for(order in orders){
				orderlist.add(order)
			}

	//calculateSumOfGivenOrder(orderlist)
	simpleOffer(orderlist);

}


fun calculateSumOfGivenOrder(fruits : ArrayList<String>){
	val apple = BigDecimal("0.60")
			val orange= BigDecimal("0.25")
			var sum: BigDecimal = BigDecimal.ZERO
			for (item in fruits) {
				if (item.equals("Apple",ignoreCase = true)) {
					sum+= apple
				} else  if(item.equals("Orange",ignoreCase = true)){
					sum+= orange
				}
			}
			println("Total Order Value is: $sum")
}

fun simpleOffer(fruits : ArrayList<String>){
	val apple =  0.60f
			val orange= 0.25f
			var orangeCount = 0
			var appleCount = 0
			var sum =0f
			var totalPrice=0;
	for (item in fruits) {
		if (item.equals("Apple",ignoreCase = true)) {
			appleCount ++
		}else  if(item.equals("Orange",ignoreCase = true)){
			orangeCount++
		}
	}

	if(appleCount>0){
		totalPrice = 	(appleCount/2)*1+ appleCount%2
				sum= totalPrice * apple
	}
	if (orangeCount>0){
		totalPrice = 	(orangeCount/3)*2+ orangeCount%3
				sum= sum+ totalPrice * orange
	}

	println("Total Order Value is: $sum")

}
package vendingMachine.inventory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Inventory {
	private Map<Integer, Product> aisleProductMap; // aisle -> product
	private Map<Integer, Integer> productCountMap; // productId -> count
	private Queue<Integer> availableAisles;

	public Inventory(int aisleCount) {
		this.availableAisles = new LinkedList<Integer>();

		for (int i = 1; i <= aisleCount; i++) {
			this.availableAisles.add(i);
		}

		this.aisleProductMap = new HashMap<>();
		this.productCountMap = new HashMap<>();

	}

	public Map<Integer, Product> getAisleProductMap() {
		return aisleProductMap;
	}

	public void setAisleProductMap(Map<Integer, Product> aisleProductMap) {
		this.aisleProductMap = aisleProductMap;
	}

	public Map<Integer, Integer> getProductCountMap() {
		return productCountMap;
	}

	public void setProductCountMap(Map<Integer, Integer> productCountMap) {
		this.productCountMap = productCountMap;
	}

	public Queue<Integer> getAvailableAisles() {
		return availableAisles;
	}

	public void setAvailableAisles(Queue<Integer> availableAisles) {
		this.availableAisles = availableAisles;
	}

	public void addProduct(Product product) throws Exception {
		int productId = product.getId();
		int productCount = productCountMap.getOrDefault(productId, 0);
		if (productCount == 0) {
			if (availableAisles.isEmpty()) {
				throw new Exception("Out of Space to add the product");
			}
			aisleProductMap.put(availableAisles.poll(), product);

		}
		productCountMap.put(productId, productCount + 1);

	}

	public void deductProductCount(int aisleNumber) {
		Product product = aisleProductMap.get(aisleNumber);
		int updatedCount = productCountMap.get(product.getId()) - 1;
		if (updatedCount == 0) { // stock of product is finished
			productCountMap.remove(product.getId());
			aisleProductMap.remove(aisleNumber);
			availableAisles.add(aisleNumber);
		} else {
			productCountMap.put(product.getId(), updatedCount);
		}

	}

	public boolean checkIfProductAvailable(int productId) {
		int productCount = productCountMap.get(productId);
		return productCount > 0;
	}

}

public class LinkedList {

    Node head;
    
    public static Item itemList[] = new Item[100];

    private int generateItemCode = 1;

    public void insert(String itemName, int itemStock, double itemPrice) {
        Node node = new Node();

        node.item.setItemCode(generateItemCode);
        node.item.setItemName(itemName);
        node.item.setItemStock(itemStock);
        node.item.setItemPrice(itemPrice);
        generateItemCode++;

        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    // public void insertAtStart(int data)
    // {
    // 	Node node = new Node();
    // 	node.data = data;
    // 	node.next = null;
    // 	node.next = head;
    // 	head = node;
    // }
    // public void insertAt(int index,int data)
    // {
    // 	Node node = new Node();
    // 	node.data = data;
    // 	node.next = null;
    // 	if(index==0)
    // 	{
    // 		insertAtStart(data);
    // 	}
    // 	else{
    // 	Node n = head;
    // 	for(int i=0;i<index-1;i++)
    // 	{
    // 		n = n.next;
    // 	}
    // 	node.next = n.next;
    // 	n.next = node;
    // 	}
    // }
    public void delete(int deleteByItemCode) throws NullPointerException {
        Node n1 = null;

        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            if (deleteByItemCode == head.item.getItemCode()) {
                n1 = head;
                head = head.next;
                n1 = null;
            } else {
                Node previousNode = head;
                Node currentNode = head.next;

                while (currentNode != null && currentNode.item.getItemCode() != deleteByItemCode) {
                    previousNode = currentNode;
                    currentNode = currentNode.next;
                }

                if (currentNode != null) {
                    n1 = currentNode;
                    previousNode.next = currentNode.next;

                    n1 = null;
                }

            }
        }
    }

    public void delete(String deleteByItemName) throws NullPointerException {
        Node n1 = null;

        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            if (deleteByItemName.equalsIgnoreCase(head.item.getItemName())) {
                n1 = head;
                head = head.next;
                n1 = null;
            } else {
                Node previousNode = head;
                Node currentNode = head.next;

                while (currentNode != null && !deleteByItemName.equalsIgnoreCase(currentNode.item.getItemName())) {
                    previousNode = currentNode;
                    currentNode = currentNode.next;
                }

                if (currentNode != null) {
                    n1 = currentNode;
                    previousNode.next = currentNode.next;

                    n1 = null;
                }

            }
        }
    }
    
    public void clear() throws NullPointerException {
        Node delete = null;
        
        if(head == null) {
            System.out.println("The list is empty");
        }
        else {
            while(head != null) {
                delete = head;
                head = head.next;
                delete = null;
            }
            generateItemCode = 1;
            //System.out.println("List is empty");
        }
    }

    public void show() {
        try {
            Node node = head;

            while (node.next != null) {

                System.out.println(node.item.getItemCode() + " " + node.item.getItemName() + " " + node.item.getItemStock() + " " + node.item.getItemPrice());
                node = node.next;

            }
            System.out.println(node.item.getItemCode() + " " + node.item.getItemName() + " " + node.item.getItemStock() + " " + node.item.getItemPrice());
        } catch (NullPointerException e) {
            System.out.println("List is empty");
        }
    }
    
    public void getItemList() {
        try {
            for(int i = 0 ; i < 100; i++) {
                itemList[i] = new Item();
            }
            Node node = head;

            int i = 0;
            while (node.next != null) {

                //System.out.println(node.item.getItemCode() + " " + node.item.getItemName() + " " + node.item.getItemStock() + " " + node.item.getItemPrice());
                itemList[i].setItemCode(node.item.getItemCode());
                itemList[i].setItemName(node.item.getItemName());
                itemList[i].setItemStock(node.item.getItemStock());
                itemList[i].setItemPrice(node.item.getItemPrice());
                
                node = node.next;
                i++;
            }
            //System.out.println(node.item.getItemCode() + " " + node.item.getItemName() + " " + node.item.getItemStock() + " " + node.item.getItemPrice());
            itemList[i].setItemCode(node.item.getItemCode());
            itemList[i].setItemName(node.item.getItemName());
            itemList[i].setItemStock(node.item.getItemStock());
            itemList[i].setItemPrice(node.item.getItemPrice());
        } catch (NullPointerException e) {
            //System.out.println("List is empty");
        }
    }
    
    public void clearItemList() {
        for(int i = 0; i < 100; i++) {
            itemList[i] = new Item();
        }
    }
    
//    public Item[] getList() throws NullPointerException {
//        Node node = head;
//
//        Item itemArray[] = new Item[100];
//        for (int i = 0; i < 100; i++) {
//            itemArray[i] = new Item();
//        }
//        
//        int i = 0;
//
//        while (node.next != null) {
//
//            System.out.println(node.item.getItemCode() + " " + node.item.getItemName() + " " + node.item.getItemStock() + " " + node.item.getItemPrice());
//            node = node.next;
//            itemArray[i] = node.item;
//            i++;
//
//        }
//        System.out.println(node.item.getItemCode() + " " + node.item.getItemName() + " " + node.item.getItemStock() + " " + node.item.getItemPrice());
//        itemArray[i + 1] = node.item;
//
//        return itemArray;
//    }

    public int length() {
        Node node = head;

        int listLength = 0;

        if (head == null) {
            return listLength;
        }
        while (node.next != null) {
            listLength++;
            node = node.next;
        }
        return listLength + 1;
    }
}

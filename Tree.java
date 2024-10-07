class Tree{

    String data;
    TreeLinkedList nodes;
    int length;

    public Tree(String root){
        this.data = root;
        this.nodes = null;
    }

    public Tree(){
        this.data = "";
        this.nodes = null;
    }

    public void printAll(){//prints Tree in JSON
        System.out.println("{");    
        System.out.println("\"value\" : \"" + data+"\",");

        System.out.print("\"nodes\" : "); 
        System.out.print("["); 
        if(nodes != null){
            nodes.printAll(); //recursively print nested nodes
        }
        System.out.println("]");

        System.out.println("}");
    }

    public Tree get(int index){
        if (nodes != null) {return null;}
        return nodes.get(index);
    }

    public void add(String v){//adds to last
        Tree newTree = new Tree(v);
        if(nodes == null){this.nodes = new TreeLinkedList();}

        nodes.add(newTree);
        length++;
    }

    public void push(String v){//pushes to front
        Tree newTree = new Tree(v);
        if(nodes == null){this.nodes = new TreeLinkedList();}

        nodes.push(newTree);
        length++;
    }

    public void delete(int index){
        if (nodes != null) {
            nodes.delete(index);
            length--;
        }
    }

    public void deleteFirst(){
        if (nodes != null) {
            nodes.delete(0);
            length--;
        }
    }

    public void deleteLast(){
        if (nodes != null) {
            nodes.delete(length - 1);
            length--;
        }
    }

}

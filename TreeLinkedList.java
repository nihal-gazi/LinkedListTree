class TreeLinkedList{

    Tree data;
    TreeLinkedList next;

    public TreeLinkedList(){
        data = null;
        next = null;
    }

    public void printAll(){//prints Tree recursively in JSON
        //0 -> N-1 (index)
        TreeLinkedList temp_ = this;
        while(temp_ != null){
            System.out.println("{");
            System.out.println("\"value\" : \"" + temp_.data.data + "\",");

            System.out.print("\"nodes\" : ");  
            System.out.print("["); 
            if(data.nodes != null){temp_.data.nodes.printAll();} //recursively print nested nodes
            System.out.println("]");

            System.out.println((temp_.next == null)?"}":"},");
            temp_ = temp_.next;
        }
    }

    public void add(Tree value){//adds to last
        TreeLinkedList temp_ = this;
        if(temp_ == null){System.out.println("\t[TREE: Node to be added does not exist. Pending value : " + value.data + "]");} //Can never happen, but still
        else if(this.data == null){
            this.data = value;
        }
        else{
            while(temp_.next != null){temp_ = temp_.next;}
            TreeLinkedList newList = new TreeLinkedList();
            newList.data = value;
            temp_.next = newList;
        }
    }

    public void push(Tree value){//pushes to front
        if(this == null){System.out.println("\t[TREE: Node to be added does not exist. Pending value : " + value.data + "]");} //Can never happen, but still
        else if(this.data == null){
            this.data = value;
        }
        else{
            TreeLinkedList temp_ = new TreeLinkedList();
            temp_.data = this.data;
            temp_.next = this.next;
            this.next = temp_;
            this.data = value;
        }        
    }

    public void delete(int index){
        //0 -> N-1 (index)
        TreeLinkedList temp_ = this; //index = 0
        if(temp_ == null){
            System.out.println("\t[TREE: Node to be deleted is empty at index "+index+"]");
        }
        else{
            for(int i = 1 ; i <= index ; i++){//index starts from 1
                temp_ = temp_.next;
            }
            if(temp_.next != null){
                temp_.data = temp_.next.data;
                temp_.next = temp_.next.next;
            }
            else{
                temp_ = null;
            }
        }
    }

    public Tree get(int index){
        //0 -> N-1 (index)
        TreeLinkedList temp_ = this; //index = 0
        for(int i = 1 ; i <= index ; i++){//index starts from 1
            temp_ = temp_.next;
        }
        return temp_.data;
    }

}

package dataStructure;

public class BinaryTree<Key extends Comparable<Key>,Value>{
    private Node root;
    private class Node{
        private Key key; // ключ
        private Value value; // связанное значение
        private Node left,right; //ссылки на поддеревья
        private int N; // к-во узлов в поддереве с этим корнем

        public Node(Key key, Value value, int n) {
            this.key = key;
            this.value = value;
            N = n;
        }
    }
    public int size(){
        return size(root);
    }
    private int size(Node x){
        if (x == null) return 0;
        else return x.N;
    }
    public Value get(Key key){
        return get(root,key);
    }
    private Value get(Node x,Key key){
        
        // Возвращает значение с ключом в поддереве с корнем x;
        // возвращает null если ключ в поддереве с корнем x не найден;
        if(x == null) return null;
        int cmp = key.compareTo(x.key);
        if(cmp < 0) return get(x.left,key);
        else if (cmp > 0) return get(x.right, key);
        return x.value;


    }
    public void put(Key key, Value value){
        // Поиск ключа. Если найден, изменяется значение, если нет - увеличивается дерево
        root = put(root,key,value);
    }
    private Node put(Node x, Key key, Value value){
        if(x == null)return new Node(key,value,1);
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = put(x.left,key,value);
        else if(cmp > 0) x.right = put(x.right, key,value);
        else  x.value = value;
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }
}

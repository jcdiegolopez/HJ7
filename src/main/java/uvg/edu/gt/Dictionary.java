package uvg.edu.gt;

class Dictionary {
    private BinaryTree<Association<String, String>> tree;

    public Dictionary() {
        tree = null;
    }

    public void insert(String key, String value) {
        Association<String, String> association = new Association<>(key.toLowerCase(), value.toLowerCase());
        tree = insert(tree, association);
    }

    private BinaryTree<Association<String, String>> insert(BinaryTree<Association<String, String>> tree, Association<String, String> association) {
        if (tree == null) {
            return new BinaryTree<>(association);
        }

        String currentKey = tree.getData().getKey().toLowerCase();
        String newKey = association.getKey().toLowerCase();

        if (newKey.compareTo(currentKey) < 0) {
            tree.setLeft(insert(tree.getLeft(), association));
        } else {
            tree.setRight(insert(tree.getRight(), association));
        }

        return tree;
    }

    public String translate(String word) {
        return translate(tree, word.toLowerCase());
    }

    private String translate(BinaryTree<Association<String, String>> tree, String word) {
        if (tree == null) {
            return word;
        }

        String currentKey = tree.getData().getKey().toLowerCase();
        String currentValue = tree.getData().getValue().toLowerCase();

        if (word.equals(currentKey)) {
            return currentValue;
        } else if (word.compareTo(currentKey) < 0) {
            return translate(tree.getLeft(), word);
        } else {
            return translate(tree.getRight(), word);
        }
    }

    public BinaryTree<Association<String, String>> getTree() {
        return tree;
    }
}

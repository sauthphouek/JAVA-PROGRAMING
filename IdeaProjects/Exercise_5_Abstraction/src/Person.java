abstract class Person {
    int weight, height;

    Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
    // show weight
    abstract void showWeight(int weight);
    // show height
    abstract void showHeight(int height);
}

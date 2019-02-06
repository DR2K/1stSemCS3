package Interfaces;

class boxes implements Comparable {
    int length;
    int width;
    int height;

    public boxes(int l, int w, int h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public String toString() {
        return this.length + " " + this.width + " " + this.height + " " + this.length * this.width * this.height;
    }

    public int compareTo(Object obj) {
        boxes b = (boxes)obj;
        if (this.length * this.width * this.height < b.length * b.width * b.height) {
            return -1;
        } else {
            return this.length * this.width * this.height == b.width * b.width * b.height ? 0 : 1;
        }
    }
}

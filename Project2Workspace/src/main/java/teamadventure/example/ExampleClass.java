package teamadventure.example;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleClass implements Comparable<ExampleClass> {

    private int compared;
    private String otherData;

    public ExampleClass(int compared, String otherData) {
        this.compared = compared;
        this.otherData = otherData;
    }

    public int getCompared() {
        return compared;
    }

    public void setCompared(int compared) {
        this.compared = compared;
    }

    public String getOtherData() {
        return otherData;
    }

    public void setOtherData(String otherData) {
        this.otherData = otherData;
    }

    @Override
    public int compareTo(@NotNull ExampleClass o) {
        if(this.getCompared() > o.getCompared()){
            return 1;
        } else if (this.getCompared() < o.getCompared()){
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "ExampleClass{" +
                "compared=" + compared +
                ", otherData='" + otherData + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ExampleClass example1 = new ExampleClass(1, "some text");
        ExampleClass example2 = new ExampleClass(5, "more information");
        ExampleClass example3 = new ExampleClass(11, "lots of data");
        ExampleClass example4 = new ExampleClass(12, "AAAAAAAAAAAHHHHHHHHHHHHHHH");

        List<ExampleClass> examples = new ArrayList<>();
        examples.add(example4);
        examples.add(example1);
        examples.add(example2);
        examples.add(example3);
        for (ExampleClass example:examples) System.out.println(example);
        Collections.sort(examples);
        System.out.println();
        for (ExampleClass example:examples) System.out.println(example);

    }
}

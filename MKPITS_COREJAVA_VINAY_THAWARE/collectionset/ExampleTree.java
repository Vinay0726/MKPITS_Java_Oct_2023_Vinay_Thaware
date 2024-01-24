package com.mkpits.collectionset;

import java.util.ArrayList;

public class ExampleTree {
    String data;
    ArrayList<ExampleTree> children;
    
    public ExampleTree(String data) {
		this.data=data;
		this.children=new ArrayList<ExampleTree>();
	}
    
    public void addChild(ExampleTree node) {
    	this.children.add(node);
    	
    }
    public String print(int level) {
		String ret;
		ret = "  ".repeat(level) + data + "\n";
		for (ExampleTree node : children) {
			ret += node.print(level + 1);
		}
		return ret;
	}

}

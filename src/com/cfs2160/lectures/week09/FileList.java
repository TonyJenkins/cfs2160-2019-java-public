package com.cfs2160.lectures.week09;

import java.util.ArrayList;

public class FileList {

    private ArrayList <String> files;

    public FileList () {
        this.files = new ArrayList <String> ();
    }

    public void addFile (String newFile) {
        files.add (newFile);
    }

    public int getListSize () {
        return files.size ();
    }

    public void printFiles () {
        for (String s: files) {
            System.out.println (s);
        }
    }

    public void printMatchingFiles (String search) {
        for (String s: files) {
            if (s.contains (search)) {
                System.out.println (s);
            }
        }
    }

    public void printFirstMatchingFile (String search) {

        if (files.isEmpty ()) {
            System.out.println ("No files to search.");
        }
        else {

            boolean found = false;
            int index = 0;

            do {
                if (this.files.get (index).contains (search)) {
                    System.out.println (files.get (index));
                    found = true;
                } else {
                    index++;
                }
            } while (!found && index < files.size ());
        }
    }

    public static void main (String[] args) {

        FileList fl = new FileList ();

        fl.addFile ("cheese.txt");
        fl.addFile ("toast.doc");
        fl.addFile ("sausage.doc");
        fl.addFile ("cornflakes.jpg");
        fl.addFile ("croissant.png");

        System.out.println (fl.getListSize () + " items in the list.");
        fl.printFiles ();

        System.out.println ("doc files:");
        fl.printMatchingFiles ("doc");

        System.out.println ("First toast file:");
        fl.printFirstMatchingFile ("toast");

        System.out.println ("First bacon file:");
        fl.printFirstMatchingFile ("bacon");

    }
}

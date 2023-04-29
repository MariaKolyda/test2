package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            System.out.print("maria");
            try {
                Git.cloneRepository()
                        .setURI("https://github.com/eclipse/jgit.git")
                        .setDirectory(new File("/Desktop"))
                        .call();
            } catch (InvalidRemoteException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (TransportException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (GitAPIException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
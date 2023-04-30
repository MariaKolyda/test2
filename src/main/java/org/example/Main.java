package org.example;
import java.io.File;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;

public class Main {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        System.out.print("maria!!!!");
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
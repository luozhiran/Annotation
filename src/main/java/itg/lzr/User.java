package itg.lzr;


import lzr.bn.PrintMe;
import lzr.bn.Seriable;

@PrintMe
public class User {
    @Seriable
    private String username;
    @Seriable
    private String password;

    private String three;
    private String four;
}
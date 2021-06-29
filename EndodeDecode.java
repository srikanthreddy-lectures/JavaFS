/*

TinyURL is a URL shortening service where you enter a URL such as https://kmit.in and it returns a short URL such as https://tinyurl.com/y6yxa3dh. Design a class to encode a URL and decode a tiny URL.

There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.

Implement the Solution class:

Solution() Initializes the object of the system.
String encode(String longUrl) Returns a tiny URL for the given longUrl.
String decode(String shortUrl) Returns the original long URL for the given shortUrl. It is guaranteed that the given shortUrl was encoded by the same object.
 

Example 1:

Input: "https://kmit.in"
Output: "https://kmit.in"

Explanation:
Solution obj = new Solution();
string tiny = obj.encode(url); // returns the encoded tiny url.
string ans = obj.decode(tiny); // returns the original url after deconding it.

*/
import java.util.*;
class Solution{
    private HashMap<Integer,String> db = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int hash = longUrl.hashCode();
        String str = "https://tinyurl.com/"+Integer.toString(hash);
        db.put(hash, longUrl);
        return str;
    }

    // Decodes a shortened URL to its original URL.
    //https://tinyurl.com/-1388742921
    public String decode(String shortUrl) {
       String[] arr= shortUrl.split("/");
        int hash = Integer.parseInt(arr[3]);
        return db.get(hash);
    }
}

public class Main{
    public static void main(String[] args) {
        Solution obj = new Solution();
        String url="https://kmit.in";
        String tiny = obj.encode(url); // returns the encoded tiny url.
        String ans = obj.decode(tiny); // returns the original url after deconding it.
        System.out.println(ans);
    }
}

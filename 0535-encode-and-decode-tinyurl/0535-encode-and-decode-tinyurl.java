public class Codec {
        HashMap<Integer,String> mp=new HashMap<>();
      String host = "http://tinyurl.com/";
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int k = longUrl.hashCode();
          mp.put(k,longUrl);
         return host+k;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
    int key = Integer.parseInt(shortUrl.replace(host,""));
     return mp.get(key);
    }
    
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
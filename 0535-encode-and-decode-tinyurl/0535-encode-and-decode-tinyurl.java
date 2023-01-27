
public class Codec {
     HashMap<String ,String> mp=new HashMap<>();
    String BASE_URL="http://tinyurl.com/";
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        long timestamp = System.currentTimeMillis();
        String shortURL= longUrl + timestamp;
            mp.put(shortURL,longUrl);
        return shortURL;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return mp.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
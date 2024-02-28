class Solution {
   public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for (String email : emails) {
            String[] arr = email.split("@");
            String local = arr[0].replace(".", "");
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf("+"));
            }
            String domain = arr[1];
            set.add(local + "@" + domain);
        }
        return set.size();
    }
}
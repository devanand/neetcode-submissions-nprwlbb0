class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];
            String[] split = email.split("@");
            String local = split[0];
            String domain = split[1];
            local = local.split("\\+")[0];
            String cleared = local.replace(".", "");

            uniqueEmails.add(cleared+ "@"+domain);
        }
        return uniqueEmails.size();
    }
}
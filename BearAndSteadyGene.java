
    public static int steadyGene(String gene) {
    int n = gene.length();
    int required = n / 4;
    
    int[] freq = new int[128];

    for (char c : gene.toCharArray()) {
        freq[c]++;
    }

    if (freq['A'] == required && freq['C'] == required &&
        freq['G'] == required && freq['T'] == required) {
        return 0;
    }
    
    int minLength = n;
    int left = 0;
    
    for (int right = 0; right < n; right++) {
        freq[gene.charAt(right)]--;

        while (left < n &&
               freq['A'] <= required &&
               freq['C'] <= required &&
               freq['G'] <= required &&
               freq['T'] <= required) {
            
            minLength = Math.min(minLength, right - left + 1);
            freq[gene.charAt(left)]++;
            left++;
        }
    }
    
    return minLength;
}

}

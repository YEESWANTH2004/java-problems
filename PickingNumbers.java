    public static int pickingNumbers(List<Integer> a) {
    int[] freq = new int[101];
    
    for (int num : a) {
        freq[num]++;
    }
    
    int maxLength = 0;
    for (int i = 0; i < 100; i++) {
        int currentLength = freq[i] + freq[i + 1];
        maxLength = Math.max(maxLength, currentLength);
    }
    
    return maxLength;
}

}

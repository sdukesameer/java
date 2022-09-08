Scanner in = new Scanner(System.in);
        String s=in.nextLine(), r="";
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)!=' ')
                r+=s.charAt(i);
        }
        return r;
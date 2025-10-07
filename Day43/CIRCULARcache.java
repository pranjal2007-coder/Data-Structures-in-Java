package com.Pranjal.Day43;

public class CIRCULARcache {

        public static void main(String args[]){
            String [] cache = new String[5];
            int next=0;
            String [] pages = {"P1", "P2", "P3", "P4", "P5", "P6", "P7"};
            for(String page:pages){
                cache[next]=page;
                next=(next+1)%cache.length;
                System.out.print("cache: ");
                for(String c :cache){
                    if(c!=null) {
                        System.out.print(c + " ");
                    }
                }
                System.out.println( );
            }
        }
    }


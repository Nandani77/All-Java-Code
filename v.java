package allJava;

class v {

        int cid;
        String cname;
        String email;
        long phone;
        v() {
        }
        v( int cid, String cname, String email,long phone)
        {
            this.cid = cid;
            this.cname = cname;
            this.email = email;
            this.phone = phone;
        }
        void show () {
            System.out.println(cid + "\t" + cname + "\t" + email + "\t" + phone);
        }
        public int hashCode () {
            System.out.println("inside hashCode()...");
            int x = 20;
            return x;
        }
        public boolean equals (Object o){
            v c = (v) o;
            if (this.cid == c.cid && this.cname.equals(c.cname)) {
                return true;
            }
            return false;
        }
        public String toString () {
            return "" + cid + "\t" + cname + "\t" + email + "\t" + phone;
        }
    }

    class Lab2 {
        public static void main(String as[]) {
            v c1 = new v(101, "Sri", "sri@jlc", 9999);
            v c2 = new v(101, "Sri", "sri@jlc", 9999);
            v c3 = new v(102, "Sri", "sri@jlc", 9999);
            c1.show();
            System.out.println(c1.getClass());
            System.out.println(c1.hashCode());
            System.out.println(c1.toString());
            System.out.println(c2);
            System.out.println(c1);
            System.out.println(c1 == c2);
            System.out.println(c1.equals(c2));
            System.out.println(c1 == c3);
            System.out.println(c1.equals(c3));
        }
    }




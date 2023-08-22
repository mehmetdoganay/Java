package first;

public class AccessPrivate {
        private String privateValue = "private";

        protected  String protectedValue = "Protected";
        String value = "public";


        private void setPrivateValue ()
        {
                System.out.println(this.privateValue);
        }
        protected void setProtectedValue ()
        {
                System.out.println(this.protectedValue);
        }
        public void setValue ()
        {
                System.out.println(this.value);
        }

}

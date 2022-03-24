public class testdriver1 {

    public static void main(String[] args){

         SymbolTable table=new SymbolTable();
         table.insertMnemonic("halt", new Token(new Instruction("halt"), "\n"));
         table.insertMnemonic("not", new Token(new Instruction("not"), "\n"));
         table.insertMnemonic("add", new Token(new Instruction("add"), "\n"));




    }

}

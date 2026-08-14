class InvalidRecordException extends Exception{
    InvalidRecordException(String message){
        super(message);
    }
}
public class FileValidator {
    static void validate(String row) throws InvalidRecordException{
        String[] fields = row.split(",");

        if (fields.length != 3){
            throw new InvalidRecordException("Invalid row"+ row);
        }
        System.out.println("Valid row "+row);
    }
    public static void main(String[] args){
        String[] rows = {
                "101,Anu,50000",
                "102,Binu",
                "103,Chitra,45000"
        };
        try{
        for (String row: rows){
            validate(row);
        }
        }
        catch (InvalidRecordException e){
            System.out.println("Invalid input"+ e.getMessage());
        }catch (RuntimeException e){
            System.out.println("error");
        }finally{
            System.out.println("continuing");
        }
    }
}
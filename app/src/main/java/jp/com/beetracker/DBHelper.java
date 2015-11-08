package jp.com.beetracker;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.Hashtable;
        import android.content.ContentValues;
        import android.content.Context;
        import android.database.Cursor;
        import android.database.DatabaseUtils;
        import android.database.sqlite.SQLiteOpenHelper;
        import android.database.sqlite.SQLiteDatabase;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "MyDBName.db";
    public static final String JSONS_TABLE_NAME = "jsons";
    public static final String JSONS_COLUMN_ID = "id";
    public static final String JSONS_COLUMN_PARSED = "parsed";
    private HashMap hp;

    public DBHelper(Context context)
    {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(
                "create table jsons " +
                        "(int id primary key, parsed text)"
        );
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS jsons");
        onCreate(db);
    }


    public boolean insertJson  (int id, String json)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", id);
        contentValues.put("parsed", json);
        db.insert("jsons", null, contentValues);
        return true;
    }

    public int numberOfRows(){
        SQLiteDatabase db = this.getReadableDatabase();
        int numRows = (int) DatabaseUtils.queryNumEntries(db, JSONS_TABLE_NAME);
        return numRows;
    }

    public Integer deleteContact (Integer id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("jsons",
                "id = ? ",
                new String[] { Integer.toString(id) });
    }

    public ArrayList<String> getAllJsons()
    {
        ArrayList<String> array_list = new ArrayList<String>();

        //hp = new HashMap();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from jsons", null );
        res.moveToFirst();

        while(res.isAfterLast() == false){
            array_list.add(res.getString(res.getColumnIndex(JSONS_COLUMN_PARSED)));
            res.moveToNext();
        }
        return array_list;
    }
}
package com.walkerhards.notes;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class NotesDB extends SQLiteOpenHelper {

	public static final String TABLE_NAME = "notes";
	public static final String CONTENT = "content";
	public static final String PATH = "path";
	public static final String VIDEO = "video";
	public static final String ID = "_id";
	public static final String TIME = "time";

	public NotesDB(Context context) {
		super(context, "notes", null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		/*String sql = "create table "+ TABLE_NAME + " ("
				+ ID + " integer primary key autoincrement,"
				+ CONTENT + " text not null,"
				+ PATH + " text not null,"
				+ VIDEO + " text not null,"
				+ TIME + " text not null";*/
		String sql = "CREATE TABLE " + TABLE_NAME + " (" + ID
				+ " INTEGER PRIMARY KEY AUTOINCREMENT," + CONTENT
				+ " TEXT NOT NULL," + PATH + " TEXT NOT NULL," + VIDEO
				+ " TEXT NOT NULL," + TIME + " TEXT NOT NULL)";
		db.execSQL(sql);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}

}

package com.danc.daniel.notekeeper;

import android.provider.BaseColumns;

public final class NoteKeeperDatabaseContractClass {
    private NoteKeeperDatabaseContractClass() {
    }

    //Entails the Database schema and the organization and the structure
    public static final class CourseInfoEntry implements BaseColumns {
        public static final String TABLE_NAME = "course_info";
        public static final String COLUMN_COURSE_ID = "course_id";
        public static final String COLUMN_COURSE_TITLE = "course_title";

        //Describe the SQL query and the table name and the columns
        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE" + TABLE_NAME + "(" +
                        _ID + "INTEGER PRIMARY KEY" +
                        COLUMN_COURSE_ID + "TEXT UNIQUE NOT NULL" +
                        COLUMN_COURSE_TITLE + "TEXT NOT NULL)";
    }

    /** Contains the DB schema --- the structure and organization*/
    public static final class NoteInfoEntry implements BaseColumns {
        public static final String TABLE_NAME = "note_info";
        public static final String COLUMN_NOTE_TEXT = "note_text";
        public static final String COLUMN_NOTE_TITLE = "note_title";
        public static final String COURSE_ID = "course_id";

        /**Describes the table name and the columns created in the Contract class
         * CREATE TABLE table name (Column id, column title, column text) */
        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + "" +
                        _ID + "INTEGER PRIMARY KEY" +
                        COLUMN_NOTE_TEXT + "TEXT" +
                        COLUMN_NOTE_TITLE + "TEXT NOT NULL" +
                        COURSE_ID + "TEXT NOT NULL)";

    }
}


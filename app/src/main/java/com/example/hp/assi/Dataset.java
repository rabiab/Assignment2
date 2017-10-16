package com.example.hp.assi;

import java.util.ArrayList;
/**
 * Created by HP on 10/16/2017.
 */

public class Dataset { private int imageID;
        private String title;
        private String description;

        public int getImageID() {
            return imageID;
        }

        public void setImageID(int imageID) {
            this.imageID = imageID;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public static ArrayList<Dataset> getData() {

            ArrayList<Dataset> dataList = new ArrayList<>();

            int[] images = getImages();


            for (int i = 0; i < images.length; i++) {

               Dataset data = new Dataset();
                data.setImageID(images[i]);
                data.setTitle("Name " + i);
                data.setDescription("abc" + i+ "@gmail.com");


                dataList.add(data);
            }

            return dataList;
        }

        public static int[] getImages() {

            int[] images = {
                    R.drawable.a, R.drawable.e, R.drawable.y, R.drawable.a,
                    R.drawable.b, R.drawable.f, R.drawable.t, R.drawable.b,
                    R.drawable.c, R.drawable.d,
                    R.drawable.a, R.drawable.e, R.drawable.y, R.drawable.a,
                    R.drawable.b, R.drawable.f, R.drawable.t, R.drawable.b,
                    R.drawable.c, R.drawable.d,

                    R.drawable.a, R.drawable.e, R.drawable.y, R.drawable.a,
                    R.drawable.b, R.drawable.f, R.drawable.t, R.drawable.b,
                    R.drawable.c, R.drawable.d,

                    R.drawable.a, R.drawable.e, R.drawable.y, R.drawable.a,
                    R.drawable.b, R.drawable.f, R.drawable.t, R.drawable.b,
                    R.drawable.c, R.drawable.d,

                    R.drawable.a, R.drawable.e, R.drawable.y, R.drawable.a,
                    R.drawable.b, R.drawable.f, R.drawable.t, R.drawable.b,
                    R.drawable.c, R.drawable.d,
                    R.drawable.a, R.drawable.e, R.drawable.y, R.drawable.a,
                    R.drawable.b, R.drawable.f, R.drawable.t, R.drawable.b,
                    R.drawable.c, R.drawable.d,
                    R.drawable.a, R.drawable.e, R.drawable.y, R.drawable.a,
                    R.drawable.b, R.drawable.f, R.drawable.t, R.drawable.b,
                    R.drawable.c, R.drawable.d,






            };

            return images;
        }
}


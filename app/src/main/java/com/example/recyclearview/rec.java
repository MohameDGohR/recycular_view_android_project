package com.example.recyclearview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import com.squareup.picasso.Picasso;


import java.util.ArrayList;

public class rec extends AppCompatActivity {

    RecyclerView recyc ;
    ArrayList<film> films ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec);
        recyc =findViewById(R.id.recyc);
        film fm1 = new film();
        fm1.id=1;
        fm1.name="The Shawshank Redemption";
        fm1.desc="Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.";
        fm1.gener="drama";
        fm1.url="https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UY209_CR0,0,140,209_AL_.jpg";

        film fm2 =new film();
        fm2.id=2;
        fm2.name ="The Godfather (1972)";
        fm2.desc = "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.";
        fm2.gener ="drama";
        fm2.url="https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UY209_CR3,0,140,209_AL_.jpg";

        film fm3 = new film();
        fm3.id = 3;
        fm3.name = "The Dark Knight (2008)";
        fm3.desc ="When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.";
        fm3.gener="drama";
        fm3.url="https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_UY209_CR0,0,140,209_AL_.jpg";







        film fm4 =new film();
        fm4.id=4;
        fm4.name ="The Godfather (1972)";
        fm4.desc = "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.";
        fm4.gener ="drama";
        fm4.url="https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UY209_CR3,0,140,209_AL_.jpg";

        film fm5 = new film();
        fm5.id = 5;
        fm5.name = "The Dark Knight (2008)";
        fm5.desc ="When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.";
        fm5.gener="drama";
        fm5.url="https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_UY209_CR0,0,140,209_AL_.jpg";






        film fm6 =new film();
        fm6.id=6;
        fm6.name ="The Godfather (1972)";
        fm6.desc = "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.";
        fm6.gener ="drama";
        fm6.url="https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UY209_CR3,0,140,209_AL_.jpg";

        film fm7 = new film();
        fm7.id = 7;
        fm7.name = "The Dark Knight (2008)";
        fm7.desc ="When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.";
        fm7.gener="drama";
        fm7.url="https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_UY209_CR0,0,140,209_AL_.jpg";



        film fm8 =new film();
        fm8.id=8;
        fm8.name ="The Godfather (1972)";
        fm8.desc = "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.";
        fm8.gener ="drama";
        fm8.url="https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UY209_CR3,0,140,209_AL_.jpg";

        film fm9 = new film();
        fm9.id = 9;
        fm9.name = "The Dark Knight (2008)";
        fm9.desc ="When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.";
        fm9.gener="drama";
        fm9.url="https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_UY209_CR0,0,140,209_AL_.jpg";





        films = new ArrayList<>();
        films.add(fm1);
        films.add(fm2);
        films.add(fm3);
        films.add(fm4);
        films.add(fm5);
        films.add(fm6);
        films.add(fm7);
        films.add(fm8);
        films.add(fm9);
        madapter m = new madapter(this,films);
        recyc.setLayoutManager(new LinearLayoutManager(this));
        recyc.setAdapter(m);


    }

     class  madapter  extends  RecyclerView.Adapter<madapter.ViewHolder>
     {
         public   class  ViewHolder extends  RecyclerView.ViewHolder{
             TextView nametext ;
             ImageView filmimg ;

             public ViewHolder(@NonNull View itemView) {
                 super(itemView);
                 nametext = itemView.findViewById(R.id.nametext);
                 filmimg = itemView.findViewById(R.id.filmimg);
             }
         }

         ArrayList<film> films ;
         Context context ;


         public    madapter(Context c , ArrayList<film> films )
         {
           this.films = films;
           this.context=c;

         }

         @NonNull
         @Override
         public madapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v =  getLayoutInflater().inflate(R.layout.film,parent,false);

             return new ViewHolder(v);
         }

         @Override
         public void onBindViewHolder(@NonNull madapter.ViewHolder holder, int position) {
             film f = films.get(position);
             holder.nametext.setText(f.name);
             Picasso.get().load(f.url).into(holder.filmimg);

         }

         @Override
         public int getItemCount() {
             return films.size();
         }
     }

}

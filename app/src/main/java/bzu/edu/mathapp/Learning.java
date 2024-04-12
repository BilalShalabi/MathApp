package bzu.edu.mathapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Learning extends AppCompatActivity {
    private TextView definition;
    private ImageView original;

    private TextView title1;
    private TextView typ1;
    private ImageView img1;
    private TextView title2;
    private TextView typ2;
    private ImageView img2;
    private TextView title3;
    private TextView typ3;
    private ImageView img3;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        Intent intent =getIntent();
        setupViews();

        String Subject=intent.getStringExtra(MainActivity.SUBJECT);
        if(Subject!=null) {
            switch (Subject){
                case "0":
                    definition.setText(" In mathematics, a limit is the value that a function (or sequence) " +
                            "approaches as the input (or index) approaches some value. Limits are essential to " +
                            "calculus and mathematical analysis, and are used to define continuity, derivatives, and integrals.");
                    original.setImageResource(R.drawable.definition1);
                    title1.setText("Left Handed Limits :");
                    typ1.setText("left-hand limits (when the limit approaches from the left) ");
                    img1.setImageResource(R.drawable.left);
                    title2.setText("Right Handed Limits :");
                    typ2.setText("right-hand limits (when the limit approaches from the right)");
                    img2.setImageResource(R.drawable.right);
                    title3.setText("Continuity :");
                    typ3.setText("A function is said to be continuous on the interval [a,b] " +
                            " if it is continuous at each point in the interval.");
                    img3.setImageResource(R.drawable.continuity);



                    break;

                case "1":
                    definition.setText(
                            "The derivative is a fundamental tool of calculus that quantifies the " +
                            "sensitivity of change of a function's output with respect to its input. " +
                            "The derivative of a function of a single variable at a chosen input value, " +
                            "when it exists, is the slope of the tangent line to the graph of the function at that point.");
                    original.setImageResource(R.drawable.definition2);
                    title1.setText("Derivative :");
                    typ1.setText("left-hand limits (when the limit approaches from the left) ");
                    img1.setImageResource(R.drawable.derivative1);
                    title2.setText("Product Rule :");
                    typ2.setText("This equation says that to find the derivative of two functions multiplied by " +
                            "each other is equal to the sum of the product of function one with the derivative of " +
                            "function two and product of function two with the derivative of function one.");
                    img2.setImageResource(R.drawable.derivative2);
                    title3.setText("Quotient Rule :");
                    typ3.setText("to find the derivative of f(x) divided by g(x), you must: Take g(x) times " +
                            "the derivative of f(x). Then from that product, you must subtract the product of f(x)" +
                            " times the derivative of g(x). Finally, you divide those terms by g(x) squared");
                    img3.setImageResource(R.drawable.derivative3);

                    break;

                case "2":
                    definition.setText("an integral is the continuous analog of a sum, " +
                            "which is used to calculate areas, volumes," +
                            " and their generalizations.");
                    original.setImageResource(R.drawable.definition3);
                    title1.setText("Indefinite Integral :");
                    typ1.setText("An integral which is not having any upper and lower limit.");
                    img1.setImageResource(R.drawable.integral1);
                    title2.setText("Definite Integral :");
                    typ2.setText(
                            "A definite integral computes the signed area of the region in the plane that is " +
                            "bounded by the graph of a given function between two points in the real line. ");
                    img2.setImageResource(R.drawable.integral2);
                    title3.setText("Improper Integral :");
                    typ3.setText("a definite integral has an interval that is infinite or where " +
                            "the function has infinite discontinuity");
                    img3.setImageResource(R.drawable.integral3);
                    break;

            }
        }
    }

    private void setupViews() {

        ScrollView scrll = findViewById(R.id.scrll);
        TextView textView = findViewById(R.id.textView);
        definition = findViewById(R.id.definition);
        original = findViewById(R.id.original);
        title1 = findViewById(R.id.title1);
        typ1 = findViewById(R.id.typ1);
        img1 = findViewById(R.id.img1);
        title2 = findViewById(R.id.title2);
        typ2 = findViewById(R.id.typ2);
        img2 = findViewById(R.id.img2);
        title3 = findViewById(R.id.title3);
        typ3 = findViewById(R.id.typ3);
        img3 = findViewById(R.id.img3);

    }
}
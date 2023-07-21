package my.edu.tarc.myinsurance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.edu.tarc.myinsurance.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inflate = load UI to memory
        binding = ActivityMainBinding.inflate(layoutInflater)
        //Show the UI
        setContentView(binding.root)
        binding.buttonCalculate.setOnClickListener {
            val age = binding.spinnerAge.selectedItemPosition
            val gender = binding.radioGroupGender.checkedRadioButtonId
            val smoker = binding.checkBoxSmoker.isChecked
            var premium = 0
            if(age == 0){ //Less than 17
                premium += 60
            }
            if(gender == binding.radioButtonMale.id){

            }
            if(smoker){

            }
            //Display output LOCALE
            binding.textViewPremium.text = String.format("RM %.d", premium)
            //OR
            binding.textViewPremium.text = premium.toString()
        }

        binding.buttonReset.setOnClickListener {

        }
    }
}
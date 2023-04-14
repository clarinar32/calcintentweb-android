package com.example.calcintentweb

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class IntentActivity : AppCompatActivity() {
    lateinit var Buttondial:Button
    lateinit var Buttonsms: Button
    lateinit var Buttoncall:Button
    lateinit var Buttoncamera: Button
    lateinit var Buttonshare:Button
    lateinit var Buttonstk:Button
    lateinit var Buttonemail:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        Buttondial=findViewById(R.id.Btn_dial)
        Buttoncall=findViewById(R.id.Btn_call)
        Buttoncamera=findViewById(R.id.Btn_camera)
        Buttonsms=findViewById(R.id.Btn_sms)
        Buttonstk=findViewById(R.id.Btn_stk)
        Buttonshare=findViewById(R.id.Btn_share)
        Buttonemail=findViewById(R.id.Btn_email)
        Buttonsms.setOnClickListener {
            val uri:Uri = Uri.parse("smsto:0742886526")
            val intent=Intent(Intent.ACTION_SENDTO,uri)
            intent.putExtra("helo","goodmorning")
            startActivity(intent)
        }
        Buttoncall.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "0742886526"));
            if (ContextCompat.checkSelfPermission(this@IntentActivity,
                android.Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(this@IntentActivity,
                arrayOf(android.Manifest.permission.CALL_PHONE),1
                )
            } else {
                startActivity(intent);
            }
        }
        Buttoncamera.setOnClickListener {
            val takepic=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takepic,1)
        }

                Buttonshare.setOnClickListener {
                    val shareIntent = Intent(Intent.ACTION_SEND)

                    shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

                    shareIntent.type = "text/plain"

                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

                    startActivity(shareIntent)

                }
                Buttonstk.setOnClickListener {
                    val simToolKitLaunchIntent =
                        applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                    simToolKitLaunchIntent?.let { startActivity(it) }

                }
                Buttondial.setOnClickListener {
                    val phone = "+34666777888"
                    val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))
                    startActivity(intent)

                }
                Buttonemail.setOnClickListener {
                    val emailIntent =
                        Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "clarismukhwana1@gmail.com", null))

                    emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

                    emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

                    startActivity(Intent.createChooser(emailIntent, "Send email..."))
                }
            }
        }

package com.tapjoy;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

public class TapjoyIcons {
    public static final String BACK_DISABLED_1X = "iVBORw0KGgoAAAANSUhEUgAAAAgAAAANCAYAAACUwi84AAAAAXNSR0IArs4c6QAAANVJREFUGBljZMACDh8+LPjjx49NQKkTLOjyR48eFfv+/fsuoLg+IyPjW0ZkBfv375f5+/fvnv///6sDxVcJCgrGwBXs3btXGSgBklQA6pzn7OycCqT/MYFM2Ldvn/a/f/8OQyUnASVTQJIgOSagpDFQ8iCQLcnExNTi4uKSD5T8D5IEASag5EqgTmEgexdQZy1YFIkAamIKB+p4CxRzA7qjGUkOzAQ7EuQGoOt3A0UkgYonAk0qhFlD0BdwBSDz8IYD2EIgAQtJoMNBIbkRxQSYIuS4AACDB3ZwBMHYpwAAAABJRU5ErkJggg==";
    public static final String BACK_DISABLED_2X = "iVBORw0KGgoAAAANSUhEUgAAABAAAAAaCAYAAAC+aNwHAAAAAXNSR0IArs4c6QAAAgBJREFUOBGVVT1MwlAQpj/BGGaYWZjZHUgoJSZqZNCY4OAmuoruEGfUUYOTDhqNKGHlbyNxMp00YWKlk4ODSWn9rtLn65Py00Tf9Xv3fe/u3l2RQgs+7XZ7xXGcO9DqmUymKC3Cb7VaOsh1cCLEkySpqswr0Ol0Nm3bfoH/sseBgCp7L9NWhJ0HuQafJc7vAwLrM1MAeR/kKxDZYSC+hcPh1VQqZTKQU2Ymci6CXBXIPUVRNCKTo8q8BQMnl0Aui3A0Gs0lk8kvD5+YAk6uoNrHntN4bcTj8Z1EIvHN474IQJJx8iXWAu8E+15V1T2QLQEPsQi63a5qWdYNHHYFp2td1w9ROFvA3Ve3iP1+f2k0Gj2JZFmWL7LZbCGITAqSYRgR0zTrCFt3Jcf/QDrFySUem2Srw+HwGRsi+QTks0kEEaMUHBFc5F2OxWJbCLfFk5BOpdlslnksyHZvgYo4GAweQMzxjlREGlkeE233Fqg50J7b2KQ5Zw868QiRVCEc2PKsD4hFjtMaKZ1O/2sknzLdN6p/gPWchfFr5NFkNUpVwP86UdwIGiYUffYweWI0zkjL1w+IrgdsDR36SX6+GnhEfkUkUz8oMwVIDCJ5nHqLP35633HN2bkESIQ+qhi4R5iskEjH8N0COQY9mqY1QNjAPvsawX6dOwJPGOn4flh+AOGr3nt9vEAFAAAAAElFTkSuQmCC";
    public static final String BACK_DISABLED_3X = "iVBORw0KGgoAAAANSUhEUgAAABgAAAAnCAYAAAAVW4iAAAAAAXNSR0IArs4c6QAAA15JREFUSA21l01oE0EUx92NBpFUGpRCQMihtB4ELwbMwba2Ta1aEHpQ/MSPU/HgR1s9KV68iAU9KYIigl9YFUFFaZq2ph5yaA8eKigUPAhBQSoSBItJ/L2QCZvJbrKb2oFl5r037/9/783szK6x4j+28fHxIeDO5vP50VgsNmwYRtb4X/iAXwH4vMID/FkoFDq4ZAJADcBvADygwFUPyahPCfX0gPsSicQ9fE/Y+UOwvu4M5ubm/Ol0+jEk/Q7gGfR76iKYmZlZs7Cw8ByAXgfwnz6fb1dnZ2fKM0EqlVqbyWReEXmbHTi674Dv6Orq+iB2TwQs5jqA3+IXEWe9UfOvpmnGAP+kbKYa1OqTyWSIOe94nMDnibzNCi6YrjJgp4SJPMHTLE56I/KPfr8/1t7entZtNTOgLK25XG66CvgskXfYgQvZSp3RKgO+GeA4uiar3jJ+HwgE+qLR6C+LrmzomMHExMRWZk7x2IJTlngwGOytBi5MtmsQj8e3A/CS6AMySW/YXoTD4f0tLS1/dJsuV2QAeB8Ab6qAP6Dme92AC1lZBpRlHwt6H/BVeiSFyYZxq7u7+yQB5OzsdrpSBmzF49ls9qETOM4jnPEDXsCFsEDAbjkF8B1k29MV0Es9PT3nxMFrM4h8mLJctXMEOM8zSFmu29nd6EzALzhNJKtHSwEXXM4m87ITAdEfIMMzTnY3epMIRwA6LeXQHcjAIMNrrNFF3eZWLm1T2UWA3caxtLM0kJF6FrpEIGDL8R6UEQhJ8U1+SnlWi6w3Silv8jGuw7+6zU6uKAdleM3E3QDJpV3RID7ECzkql36F0UZRkYGaI6cpayJnUlDptH6M07Q/Eon81vRloiOBzHJzHzQ0NFS9D6oSFEla6eW63CCy3ijlLLpezqkfuk3kijXQJ+H4GZBtPPO6TWSIt9DxTVD4KKiYUjMD5SEAi4uLcQA3KZ21lwDYXTF21xervmYGanLxUu8olkSpSz3EzeyuaTbHxpKSgesMlJPXLzvXGSgCueQbGxt3Io8pndY3sb2nJicno6L3nIECW9ava0VC3X28K3eRjyidtWe9vnkukQaQZRsfRXfTqreMk0siECCizHN+yZdG2bWLLP9oh+teA0uUpSHlGqJsgyiekFnhL/MfqZJlyb8tPW8AAAAASUVORK5CYII=";
    public static final String BACK_ENABLED_1X = "iVBORw0KGgoAAAANSUhEUgAAAAgAAAANCAYAAACUwi84AAAAAXNSR0IArs4c6QAAAHlJREFUGBljZsAOBIHCu4FYC5u0GFDwAhD/B+IN6ApkgAI3oJIrgTQrsgJlIOc+VHIukGZCltQGcp5BJScCaUZkSWMg5w1UshlZAsa+A5XcCRNApwmaANKA7IYJQD6KG2Am4vUFTBHecIApQglJrHYBVYLiYhMQnwAAeiYfS1LRd+4AAAAASUVORK5CYII=";
    public static final String BACK_ENABLED_2X = "iVBORw0KGgoAAAANSUhEUgAAABAAAAAaCAYAAAC+aNwHAAAAAXNSR0IArs4c6QAAAPZJREFUOBFjYCAdWAG1PADiCUDMBMQkAReg6i9A/B+KZ5Ki2w+o+AeSZpAhF4g1IBKo8Dea5utAvjQxBqQCFf1F03wOyBclRnMRmkaQs48CsQAxmuuxaN4DFOMmRnMPFs0bgWLshDSD4hUUNbBogtHLgGIshDSDFCzFonkWUIxgggE5bQMWzX1AMYIAFCi7gRjmXBjdSFAnVMFOLJqLidUM8hvIRooALi80kGIqRYEIs4iiaIQZQlFCghkConuBGBadMJqopIxsSD0WQ4jOTDCDcGVnfpgCYmiKChSYBdiKtGtASaKKNJghFBWqMEMoKtZhhqBULADcM3nkekaNxwAAAABJRU5ErkJggg==";
    public static final String BACK_ENABLED_3X = "iVBORw0KGgoAAAANSUhEUgAAABgAAAAnCAYAAAAVW4iAAAAAAXNSR0IArs4c6QAAAdVJREFUSA21V7tKA1EU3KgoWKTRxipW2kgstdTGxt7eHxAhttqrRTq19tGEEFu11EbQUjsrH6CNDywE8TUDXhgCexPO2Xtg2MmePTN3795XsqzYqEHuHqgDvcVKZ9k6BH8FTfD+IkxKENkWYTVpeA3YDXs54jR69Bjw9VsR8XfkZq0Ggyg8ioi/IDdtFS+j8DQi/oTcpFV8CIUXEfE75Mat4iMovIqI3yA3CpiigioK6BBUfo0cG2CKMVTdAiqo/BK5YZMyiqoAP5oKKj9Djh/dFFOoegZUUPkJchyupphBFSeKCio/RG4AMMU8qj4AFVS+j1yfSRlFC8AnoILKd5DrAUyxiKovQAWVb5pU/4uWcP2JiK95xFciwjRd9oiz9hXQrlB+4BXnhsF+n8sRmsD9N+A8J9/17U7fYLVrpciDHEXfgHaRctcoCr5J50EwSTqTgwk3605rkfvM02k1PUYjzKtpeJMqSLL9IJhwR+NmriNKOXc0HgZcUUF1sj05tCzpqSKYsCvYJdpFyl3nomBSBkl2sgsmHJ4cptp65a6zaTDhRGtFTDhROWFdweV+F9DWK3f9PwgtK4Fs5Zg0wkNFXDfaTJr47V6v2htWw40HoA6w+7I/GK4XQGwjqjkAAAAASUVORK5CYII=";
    public static final String CLOSE_1X = "iVBORw0KGgoAAAANSUhEUgAAAA0AAAANCAYAAABy6+R8AAAAAXNSR0IArs4c6QAAAHtJREFUKBWVkksKwCAMREOh99+3y97GU3iTdp6tRcUoBgbJfEgCmpkF4RA2YVTo+PDbKdzCJXhBeHR8BJMxE71gGah0T/B4hqVqDbvY0QZfrF41ip3d+geZkAO89MMqV4xyTieVAW6Z3tQG6CmP94U319dXfwT+pb9HIDwrxDUcBOiFBQAAAABJRU5ErkJggg==";
    public static final String CLOSE_2X = "iVBORw0KGgoAAAANSUhEUgAAABoAAAAaCAYAAACpSkzOAAAAAXNSR0IArs4c6QAAAQZJREFUSA3NlmEKwyAMRmV/d8werFdxZ9lBtu+TBaKNabLKmBBsNXlPLUJLKWVDPBE74o5Y1cgik2w62sMLPeOBWCEjgyzhUtasMsC+Iq7IRgmZO6JBtf2KzJJ0p2Ql1M8iuJhIsxidRCBWYsUkx8+aVWtKBJQuQOE3Nc2XKczkyma6PgKI5HTQ2YsH8uZmPHd8Bhyvg/vhXYOatGS8axJLJOKbycKSm5D+oeduKkKOauzDu/I2Yx0ZwQwtvCSbSTjuzXkLP8xFQJGcA1gPZACZXO346kjSsnSBWmK4Npyo4OPjKeM0YSQ67y5rR+GyOwGWJaPjd79b/LnjfxetXM2qRhaZZG9vKwfPPlaIrEQAAAAASUVORK5CYII=";
    public static final String CLOSE_3X = "iVBORw0KGgoAAAANSUhEUgAAACcAAAAnCAYAAACMo1E1AAAAAXNSR0IArs4c6QAAAYpJREFUWAnNmOttxSAMRjPG7d+u0M07QcYoc9wBWp9UvkJpcDAYqCUHxOPziY0SiW3btnfxXfwp/in+EF9hxCU+HLs4XEfnW1r1JP03JiYa8YirDLS7+EGaD9KfCXgFBgMZPFJ5hpsFWAIjPiU+ztg5pQr7JfMIjDALjLivs3+3MBrQHc+9oTGdVpwkmsxfmrUxosSWvgmmtJZAD6ClWwU2CjAMLBowHKwGsKYUw8B6AYeDtQJOA/MCTgerBfyQhXxu9PeXt0nGAR9qVmZymLw/BUzf2gM4FcwDuARMATljefnOfeaXGKUtHX6F7PkXN79UDdgSQA/YVEALLEkdrO/c0BLfgTGP1a77XR3w9Ab0rm9GbA3Uuq8atDdA7/4iaJRwlM4LNFowTA+hJK7fqLxlnPkWY1/pj1KliwALcyDtVwncUKPfBDgaTLndgLPA3IAP2ZHEtXx5yzjgIwxdq8RwLb+fKwEe93NPAcyzRX9kxkhIbmSQeGcGuP7cCfMmbJhpV4A7AP/2Nv0HnzzhcY3M7cIAAAAASUVORK5CYII=";
    public static final String CLOSE_CIRCULAR_1X = "iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyRpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNiAoTWFjaW50b3NoKSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDo1MkQxQ0FBNzNBOUQxMUUzOTMxMENBMjk4MUFBRDY3NSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDo1MkQxQ0FBODNBOUQxMUUzOTMxMENBMjk4MUFBRDY3NSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOjUyRDFDQUE1M0E5RDExRTM5MzEwQ0EyOTgxQUFENjc1IiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOjUyRDFDQUE2M0E5RDExRTM5MzEwQ0EyOTgxQUFENjc1Ii8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+PlnJTwAABFhJREFUeNpi/P//P8NwAEwMwwSMemTUI6MeGfXIqEcGBLBQ2Tx+IC4GYi8gVgRiPiQ7fgPxWyC+CMTLgHg1EH9PjI3Hadj8xQuJtpiRSjW7GhBPAWKnnz9//rp/797Hq1evfrl7687Pjx8//mFiZmKQlpFl0dBUZ9fU1OQRExfnZ2RkBKWGxUBcDfTMq8HgkXlAHPfm9evPSxcveX7h/IVvhDSwsbExBIUEczm5OEuysrKyA4XKgZ6ZPFAeYQPiE3///tUBeuDB/r37PpFsANBDaZkZfMYmxgpA7iFQkgR66Bc9PQLyxOWvX79K19fW3X37+s1vSqLU3MKCNS0zXZmJiek2iAvzDCkeIbfUOv7t2zfpsuKSW5R6AgROnjjxu72l9da/f/9Ugdyd9Cp+ZwOTk25DTd3db1+//aNWcXfn9p1/kydMugtkWgNjoopU/aQmLWkgfrh00ZJ7e3bv/sRAA5CYksRnZ28vA2SC8s0rWsXI7Hdv332mlSdAYMHc+Z++f//+E8icTKukxQ3EbiuWLX+OS4GomCibiZkpHyGDQGpAarHJgVLIhrXrQXYEAjEnLTxS8AsITp86hbOekFdQ4EhNT1O2sLIUwKUGJAdSA1KLS82unTu//QECIDOFFk0U34cPHn7Ep+DMqdOfWFhY7icmJ4GaJ/dPHDv+Ad0TILn5c+fdB6nFZ9bjR48/KiophhGbxEjxiOq1q1ffEVIEdTyGZ5A9ge5BbODqlStfgB7RoEWM8N28cfM5MQrRPQMujUjwBAhcv379p4+frwAtPMLy6tXLP8QqhnkmOTUF5BmGubPnEO0JEHj54sUfUtw3Ivsjf8TExFnevnlLVKzA8gQoJmBJC1sBgAuIS0iA3PaHFh75pK6hzn792rUfxHoCLU/cJ8UzwH4LqHn/gRZJ67aWtjYPmZ4A5xmQGEgOXz0DA9o6OiC7btAiRjbLK8hXA+mn+GpsfKUTcmkGrO/u4qtLZOVkQd3mVcQ6jrmhoYFYteeYmZlrnj199unZ06dYm+6/f//+f/fu3c+nTpzEWXE+efzkx4sXL749fPDgB7D1/BebGjd3dy59A30RIDOM2HxCaut3G7DRaFlcUHiXVqUPsC/PMHXmdGVOTs5dQG44rYrfVCFhIV5nVxc+WnkkITmRD+gJUEbPpWXHCpQ/5kdGRymIioqyUtsTBoaGrMC+CKgf0oJrZIWaFWIqMK9cbmhpUubi5qJahaqsosKUW5CnDGQeBXqijV4jjZZcXFxPu3p71IRFRSiOGTNzM9aq2mo1JiamO0CuO7367CAAGuXQ5ebmvtXZ3aXp6OxEVp4BDQdl5+XwZeZkawI9cQLkJ+ThIFr22YflAB0ywBgyvXb12pfbt279/PTx0x9GJiYGGVkZFi1tLXYtLS0eYRGRQTlkigzQB7FBfGZYfQnEb0AVKxCvAOK1DINwEHvAwehEz6hHRj0y6pFRj4x6ZNQjw8kjAAEGAG3QB833yd52AAAAAElFTkSuQmCC";
    public static final String CLOSE_CIRCULAR_2X = "iVBORw0KGgoAAAANSUhEUgAAAGQAAABkCAYAAABw4pVUAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyRpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNiAoTWFjaW50b3NoKSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDpCMzkzQ0FBNjNBOUIxMUUzOTMxMENBMjk4MUFBRDY3NSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDo1MkQxQ0FBNDNBOUQxMUUzOTMxMENBMjk4MUFBRDY3NSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOkIzOTNDQUE0M0E5QjExRTM5MzEwQ0EyOTgxQUFENjc1IiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOkIzOTNDQUE1M0E5QjExRTM5MzEwQ0EyOTgxQUFENjc1Ii8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+zKDHdQAACCFJREFUeNrsnHlM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";
    public static final String FORWARD_DISABLED_1X = "iVBORw0KGgoAAAANSUhEUgAAAAgAAAANCAYAAACUwi84AAAAAXNSR0IArs4c6QAAAQZJREFUGBlj3L17dzcDA4MFBweHn62t7XsgGwUwMTIyqgJFbH7+/Ln/6NGjYiiyQA6TgIBAKJBe9f//f/3v378f2r9/vwyyIkYQByjJtHfv3tlAOglo4gMgdnF2dr4LkmMCEUCBf0CBFCA9CahI4d+/f4f37dunDZYDEcgAaFIzUEENUPFbJiYmd7AVyApAbKDPdgIpN6Ciu2ArkBWATIBKgkwIZ4ZJAu1mBIbDRCBdChR7zszM7AQEF1lACoCCGL4ASoJ9wXjmzBnW9+/fLwGqCwPaeROo08XR0fEJSCMIsHz48GE1kPYHSl7k5OR0s7a2fgWWgRJMQONvA9lH2NnZHdElQWoAIf5qWl4Zy0sAAAAASUVORK5CYII=";
    public static final String FORWARD_DISABLED_2X = "iVBORw0KGgoAAAANSUhEUgAAABAAAAAaCAYAAAC+aNwHAAAAAXNSR0IArs4c6QAAAg9JREFUOBGlVT9IAmEU9zsPHByadGlwcmhsaWgQPHUqQhCKHHIqayybQ/f+TEHZ1lAQORgVyJ0KDg1tboGLs80Nynn2e4cfvPPuSvBAvvfv997vve+PYjKZKM1m8zIQCGSFEPlUKvUBee5P6LpeRfT+FPGDJNl0Om3Mm0EBYI0Fh8HotdVqbTHbnyIl2EDEF4sKWZZVQ1u7zOYrCvJ0Op3IaDRqoPoqi7QURTnETO6YzSUqZEkkEt/BYFADGz5ABUyqhmGcuFDMYDOQerfbDQ8Ggzr0lLTRCiZlMKlwm5QdCcjY6/VC/X7/CaJjkGB3gd05lUC52i1IhdZ4PD5UVTUH8ZHbMZ8S2rmlc8PtLgbSSYEA3ECXZ0S6HlCgkEwmTTI4sskIWkHZymQyB+j/itsh58fj8TO1asfNOD1VMKmA0Rl3ooARiUSyvi3wYJKRpIQk5zP2hm8LM4G+6lwJcOHKs9WphWg0mvu3BbrqOJHHnALA9VgstmNvOXdwWW4jwK5txLEvAGxvoyeDdrutmqZ5j4SOG4nKVRzpI6yWLOaaAe0vwDUPMB3lIgdTEgeDhS4TJr2E7O/ofV3SsysIUUJlejM9vyBZ6UHBsAyA+fNGD0oR4GtP5NQosE3LAOvQV2QgmJj47WFgjhsp/XxVUfWNgyEPUXlb07QXHugnK0jwyZz0rG/OCyacQIKF/lh+Ad6p1jUc5HZEAAAAAElFTkSuQmCC";
    public static final String FORWARD_DISABLED_3X = "iVBORw0KGgoAAAANSUhEUgAAABgAAAAnCAYAAAAVW4iAAAAAAXNSR0IArs4c6QAAA4dJREFUSA21l01oE0EUx5tNjSBBUhAh4EEoVbAHDwbMoWmxbfAb/KqoLUhBsHhQD1ZP4sWT/brZkyhKq1hEEaTapF/ppUK8CDlo8RAQAoJYbRFNSeLvBWaZbHbTbVoXljfvPzP//3tvJjMbTw1PoVDwxuPxfo/H04E71N7ePiD4RjyeVCrly2Qyo4icVoQI3UPklvLXYw3IR3RyIcO/GYvFhrGe9ZDLXIM34kDSMzk5+RgRr0O/K1gEzlOSZbvRkHchMiZltOt3gxVLMD09Hc7lcuMQBhwmvaurqzsVCoV+O/Q7wmaNp6am9iIywcjtdqPJcs7v9x8Lh8O/7PqdMFNABiCyO5/Px8lkh8OEJEKH2GHfHfrLYFkD82ltbf3k9XojkHwxwdJGCHc2kUgES2FnryQDNUwIstmsZLJHYbqVAHjbeNI6btcuyUANaG5uzpBJCyQfFKZbhOsp5Ry//l06bte2zUANnJ+f37q0tPQGv0lhFvuNIKKsyUcLbrq2Gahe2TFsz4OQxBRmsbLjZtgc+y246VbMQI1aWFjYnE6nn1GaEwrTLQEs03c8Go3O6Li0K2agBjc0NPxlTTogGlGYbiH30zfO+XVUx6XtKgM1CSKDo+M+9rLCdIvIimEYXWz35wp3lYEaDEGeBe3B71eYbhHexGkwShDdCl+TgJpErXsRu6N8i/Ui9IAtfFXwNZXIQlRDpNchG+S15aFcvbYdVqJKPgsrC3/BYczPqkqkyCSDCuQ1ZHC3agFqfJvjYkiJ6Zb1KfBe46zqr6pElKUPwhs6qdbOE/klyB8Ktqb7lsU0IpHIMPOKO0QjLTaJeoUfZCfk5g/SdQZcq7Xs8UeIdFqJxYf8D31n2MJyOJqPqzWQswjysQrk8tFwxEouKqtmkEwmtywuLr6CPGqGpTWI/Ac1P8zx8F6DzWZFgY24DxwFqPk2yvKWyPeZ4WgNIv+K28bZ9FmDy5q2ayB3MuSzFcjlTm5ajVzUyjIg8p2Qy4VfXxaOTPB4Uj6fLyr3tl2/FSvJQL6LIJ+rQC4fAS1uyUXMzOB/fdnVior6NqXp9G06EQgETlb1bcqhdQDi15TFL2LWh5q/DAaD5xobG7PWPje+ZPDUiZy+J5wr3Yjk3JDZjZFFTth1gA2zDS+uh1x4DdLvguSFLoLfx7lyBVvQ8WraxV1EiYr/MiE4C+kgkQ9UQ2Y35x9yzXLgAH1NFAAAAABJRU5ErkJggg==";
    public static final String FORWARD_ENABLED_1X = "iVBORw0KGgoAAAANSUhEUgAAAAgAAAANCAYAAACUwi84AAAAAXNSR0IArs4c6QAAAHpJREFUGBmF0DEOQEAUhOGHOIBGpVMqXcK9lCoHcACdVu0CSoVEp+IK+F8p+6xJvmYy2eyuiEiDCQnMDLQ3ZqTWIqbsoaMFGZyENB10tCGHk4CmhY52FDBT0+roQGkuKEfoaLUGnyd47+B9xe8/eH8y4pb6lAsVTrzyAG/RII+JIhYrAAAAAElFTkSuQmCC";
    public static final String FORWARD_ENABLED_2X = "iVBORw0KGgoAAAANSUhEUgAAABAAAAAaCAYAAAC+aNwHAAAAAXNSR0IArs4c6QAAAPJJREFUOBGllTEKAjEQRYMIFhbaWHkTa2t7D+AF9ABqL7Kt9lprJ2hrK1ba7iEsBBF9Aw6EJcIkGXiMG35+NtnJ6JxzNSighB5Ex5oZnx8Pcj/W4eoZiNETBjEmXcR30LeQ/IIhmKOD8gK+yZvnkdkBYRvO4JvI7zGYo4nyBFWTqdkBYQP2AZNFjEkd8TZgsmJM6sYUIvRrRLe1YVwWMMcSpU7WvGNMtmqOOUqdrPnImBy6OSYodbLmg/lAzMv8Ec4Cq5u3kHyIWZ8xq5CySjnrMrU46eTrnNVQpKXdKt85qqVlN1X/yia1dSmYAkqI/mP5AqOFeOWKij/DAAAAAElFTkSuQmCC";
    public static final String FORWARD_ENABLED_3X = "iVBORw0KGgoAAAANSUhEUgAAABgAAAAnCAYAAAAVW4iAAAAAAXNSR0IArs4c6QAAAbJJREFUSA21l7svBFEUh2cREoWGRmUrOkpKW4no9f4Bkax29Si2Q+3RILToUFLSqTwSGo+ISMTrO9mM/LJhRu6Ze5Jv58w9e37n5s7jnkmShrVyqMM1VBtDxf22I7UNX8J8cfJJsiXCWmSZ8VIRhW7/KGDF1sCWz2UVsp9BZ6/+DjFbRpeNkP0AKqz+HrFOVwWSh+AOVFj9I2Jd4LIBsq9AhdU/IdbtqkByGS5AhdU/I9YLLjOBc1Bh9W0Cfa4KJPfAKaiw+pfE+sFldlGPQYXVt5ti0FWBZLs9D0CF1b8nNgwu6yB7F1RYfXtQR8FlbWSvgwqr/0pswlWB5BZYARVW/43YJLhtEQUVVv+d2JS7AgJzGUU+iU1bEc+r+JD8JxiDEqjZ+Ti86GCov0GiLpH6j6Giad5MhrgVmk3/GHKsZYj/XIMQYcvJuos+iAffRVGfg6hP8n/eRZXQ9Y76No26H+TtaNYcBO9oUffkMjOL1lXk9UXWBAT3RVE7u7zedJ+ZB/em9oBE7a6zvg9WKe7ZlEhPkk3QTSL1lxi3ncltv32jLbhVmwRsGepwA9WmmOv0G/O5F1exz8AAAAAAAElFTkSuQmCC";
    public static final String OUTLINK_1X = "iVBORw0KGgoAAAANSUhEUgAAAA0AAAANCAYAAABy6+R8AAAAAXNSR0IArs4c6QAAAQhJREFUKBWFkj1uwkAQhd9YdhMfg4uk5wyEjiSmiFBElT+hIKpIqRxSBlJzAwqq1FyAJndwGiRP3kNayRY2jLTa8eh945mdsd7c71FiAiDlOZgZ/paZpVe5Zw7kIR7uWABFG3NsQtAde/lRgh/fYyzfDTeMd+THPKmAxdDeFKja18C2/N725z71Eh0m3wmMqqImv/fhr2WJBximTP4pzUlIAByPAr4zewpJW6EmwBKsDRiqpyNrAiQKPR5Bajr0UC1JEEdwx1JntfIIjNoAQSwt4etd1P7kEVbKsri1d4narAYtr+2XwpOAEgkqOO3Lfs6FOWPScQRFzEm9cNoTIt0zDHcJBbfi+R8ArmkcWE7RygAAAABJRU5ErkJggg==";
    public static final String OUTLINK_2X = "iVBORw0KGgoAAAANSUhEUgAAABoAAAAaCAYAAACpSkzOAAAAAXNSR0IArs4c6QAAAWpJREFUSA29ljFSw0AMRSWPhxMk0FNyCOAigRpoU8DQ0DChoA09oeMWHIKChgMk4QqI/w1iHIdde70etrBmrZXeSivLqzfPtvO+llsxOTWRsUSGiqwWF7rrSyYP9gq7A5/HZEmImUxji4bQlYyEjrDbT1NZx5wi4qb+A4bLLRuT36hdp5M54uGAwdO57rmirzyZ2wwOL5v2RfNFzjwEoc/BQE0IjuKuntZBQH9BUJ1X9exkg7pAslPXFZIFSoEQVPKROhIgbyiI6ttLBiVABN/loQeRVAwpEAe47AzKgRDWKXV9Iezuat9/hFZQX8hPykboe9WvJ5q6TIgfTyWDIIR9VO/C7F3NtrLhqWUSBKE0X7SQql/lQriHIIjKxZmyAx/nREI/HFEQFzAyytzRCsoFuP2/gRQlvGSt48BbLye+uwQ5xuVH4XtV4rAfMZkCVkBu3V4SnIaXglHsj+QayHtSwyv7aeiTvsn4AsmQmKnJPOu5AAAAAElFTkSuQmCC";
    public static final String OUTLINK_3X = "iVBORw0KGgoAAAANSUhEUgAAACcAAAAnCAYAAACMo1E1AAAAAXNSR0IArs4c6QAAAh1JREFUWAnt2D9LAzEUAPD3zigdBD+CfzYVVxcHLTg7OLjZCqKCXVVcCh1Fxa2KRQTr5jcQhOLgF1Ck4KC4CI6Ck7SN79VeLz1oe7m7pB0MXO8lzSU/XsIRDoFKriTFWxn2pYQViTAFEga4XaO8X2dwTO2/diYXqjUoqW26sWDYaxnuCDZff1jqDmGuv9PI2B/M3DyhRnZ4KUM9aeEh0dhj3lQIBUfCg9fQPaoBfPt7CQFl+QNpf7tapx20R9e02qbGuJqn3CnFAUhfZbCoNBkJU6fyiGbe6TQ4WeyXIDBWWce1gyHAsz9NVnFtYQjHhDvsGa4TrLiNu34Y161kLgzMCi4szDguCswoLirMGC4OmBFcXDDGCf6Jq0SBDQ7BbaUCSdUSGy4KjEEXG/hJN76aJZb3XFRYU+MLIuNMwdgZCWcSxrjQey5uGJ0rl8lzwii3hMLFDWMMLeEwnahHXVijTa12j03A2s2qtedswrQyZxsWGLd5LkfoK8CSP/1IJ9h2B0V/3zD1QMta2MIvkYAkHaVf3ElMw3ieQDjueLmOHy7QBkwL5wITAmZNLiXP45bAmXMf4CV2Y9N3bZxpkDr+P07Nhk4sAKGqfsmsIcyl8y3fdnTGC92X5yWHV8iFqbx8pLYZr7U/InqnPjn0zrrpD06rgl3O+CQcUHDf+ldva+xhl5NLYmViEhYdhCynsr4He2HjPVZfSsiyh12//6P3ArVQ5C4AAAAASUVORK5CYII=";

    public static Bitmap getBackEnabledImage(float f) {
        int round = Math.round(f);
        return getImageBitmap(round != 1 ? round != 2 ? BACK_ENABLED_3X : BACK_ENABLED_2X : BACK_ENABLED_1X);
    }

    public static Bitmap getBackDisabledImage(float f) {
        int round = Math.round(f);
        return getImageBitmap(round != 1 ? round != 2 ? BACK_DISABLED_3X : BACK_DISABLED_2X : BACK_DISABLED_1X);
    }

    public static Bitmap getForwardEnabledImage(float f) {
        int round = Math.round(f);
        return getImageBitmap(round != 1 ? round != 2 ? FORWARD_ENABLED_3X : FORWARD_ENABLED_2X : FORWARD_ENABLED_1X);
    }

    public static Bitmap getForwardDisabledImage(float f) {
        int round = Math.round(f);
        return getImageBitmap(round != 1 ? round != 2 ? FORWARD_DISABLED_3X : FORWARD_DISABLED_2X : FORWARD_DISABLED_1X);
    }

    public static Bitmap getCloseImage(float f) {
        int round = Math.round(f);
        return getImageBitmap(round != 1 ? round != 2 ? CLOSE_3X : CLOSE_2X : CLOSE_1X);
    }

    public static Bitmap getCloseCircularImage(float f) {
        return getImageBitmap(Math.round(f) != 1 ? CLOSE_CIRCULAR_2X : CLOSE_CIRCULAR_1X);
    }

    public static Bitmap getOpenBrowserImage(float f) {
        int round = Math.round(f);
        return getImageBitmap(round != 1 ? round != 2 ? OUTLINK_3X : OUTLINK_2X : OUTLINK_1X);
    }

    public static Bitmap getImageBitmap(String str) {
        byte[] decode = Base64.decode(str.getBytes(), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }
}

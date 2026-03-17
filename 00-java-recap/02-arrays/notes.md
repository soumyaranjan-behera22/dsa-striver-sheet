# 📌 Binary Search – My Mistakes & Confusions Notes

## 1️⃣ Pointer me kya store hota hai

**Confusion:**

`start` aur `end` me  **array values store kar raha tha** .

<pre class="overflow-visible! px-0!" data-start="320" data-end="380"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼt">int</span><span></span><span class="ͼt">start</span><span></span><span class="ͼn">=</span><span></span><span class="ͼt">arr</span><span>[</span><span class="ͼq">0</span><span>];</span><br/><span class="ͼt">int</span><span></span><span class="ͼt">end</span><span></span><span class="ͼn">=</span><span></span><span class="ͼt">arr</span><span>[</span><span class="ͼt">arr</span><span class="ͼn">.</span><span class="ͼt">length</span><span class="ͼn">-</span><span class="ͼq">1</span><span>];</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

**Correct Concept:**

Pointers  **array ke index store karte hain** , values nahi.

<pre class="overflow-visible! px-0!" data-start="465" data-end="517"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼt">int</span><span></span><span class="ͼt">start</span><span></span><span class="ͼn">=</span><span></span><span class="ͼq">0</span><span>;</span><br/><span class="ͼt">int</span><span></span><span class="ͼt">end</span><span></span><span class="ͼn">=</span><span></span><span class="ͼt">arr</span><span class="ͼn">.</span><span class="ͼt">length</span><span></span><span class="ͼn">-</span><span></span><span class="ͼq">1</span><span>;</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

✔ Pointer → **index**

❌ Pointer → **array value**

## 2️⃣ Mid comparison mistake

**Confusion:**

<pre class="overflow-visible! px-0!" data-start="624" data-end="650"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼn">if</span><span>(</span><span class="ͼt">num</span><span></span><span class="ͼn">==</span><span></span><span class="ͼt">mid</span><span>)</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Yaha `mid`  **index hai** , value nahi.

**Correct:**

<pre class="overflow-visible! px-0!" data-start="705" data-end="736"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼn">if</span><span>(</span><span class="ͼt">num</span><span></span><span class="ͼn">==</span><span></span><span class="ͼt">arr</span><span>[</span><span class="ͼt">mid</span><span>])</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

✔ compare with **arr[mid]**

---

## 3️⃣ Pointer update mistake

**Confusion:**

<pre class="overflow-visible! px-0!" data-start="819" data-end="868"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼt">start</span><span></span><span class="ͼn">=</span><span></span><span class="ͼt">arr</span><span>[</span><span class="ͼt">mid</span><span class="ͼn">+</span><span class="ͼq">1</span><span>];</span><br/><span class="ͼt">end</span><span></span><span class="ͼn">=</span><span></span><span class="ͼt">arr</span><span>[</span><span class="ͼt">mid</span><span class="ͼn">-</span><span class="ͼq">1</span><span>];</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

Yaha phir se  **value assign ho rahi hai** .

**Correct:**

<pre class="overflow-visible! px-0!" data-start="928" data-end="971"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼt">start</span><span></span><span class="ͼn">=</span><span></span><span class="ͼt">mid</span><span></span><span class="ͼn">+</span><span></span><span class="ͼq">1</span><span>;</span><br/><span class="ͼt">end</span><span></span><span class="ͼn">=</span><span></span><span class="ͼt">mid</span><span></span><span class="ͼn">-</span><span></span><span class="ͼq">1</span><span>;</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

✔ pointer ko **next index** pe move karo.

## 4️⃣ Loop confusion

**Confusion:**

Binary search me

<pre class="overflow-visible! px-0!" data-start="1079" data-end="1110"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼn">for</span><span>(</span><span class="ͼt">i</span><span></span><span class="ͼn"><</span><span></span><span class="ͼt">arr</span><span class="ͼn">.</span><span class="ͼt">length</span><span>)</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

use kar raha tha.

**Correct Logic:**

Binary search  **search space khatam hone tak chalta hai** .

<pre class="overflow-visible! px-0!" data-start="1212" data-end="1243"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼn">while</span><span>(</span><span class="ͼt">start</span><span></span><span class="ͼn"><=</span><span></span><span class="ͼt">end</span><span>)</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

✔ condition search space par depend karti hai.

---

## 5️⃣ Sorted array requirement

**Confusion:**

Unsorted array me binary search use kiya.

Example:

<pre class="overflow-visible! px-0!" data-start="1401" data-end="1432"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>{</span><span class="ͼq">12</span><span>,</span><span class="ͼq">13</span><span>,</span><span class="ͼq">90</span><span>,</span><span class="ͼq">38</span><span>,</span><span class="ͼq">20</span><span>,</span><span class="ͼq">82</span><span>}</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

**Correct:**

<pre class="overflow-visible! px-0!" data-start="1448" data-end="1479"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>{</span><span class="ͼq">12</span><span>,</span><span class="ͼq">13</span><span>,</span><span class="ͼq">20</span><span>,</span><span class="ͼq">38</span><span>,</span><span class="ͼq">82</span><span>,</span><span class="ͼq">90</span><span>}</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

✔ Binary search  **sirf sorted array me work karta hai** .

---

# 🎯 Golden Binary Search Template

<pre class="overflow-visible! px-0!" data-start="1580" data-end="1828"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute inset-x-4 top-12 bottom-4"><div class="pointer-events-none sticky z-40 shrink-0 z-1!"><div class="sticky bg-token-border-light"></div></div></div><div class=""><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span class="ͼt">int</span><span></span><span class="ͼt">start</span><span></span><span class="ͼn">=</span><span></span><span class="ͼq">0</span><span>;</span><br/><span class="ͼt">int</span><span></span><span class="ͼt">end</span><span></span><span class="ͼn">=</span><span></span><span class="ͼt">arr</span><span class="ͼn">.</span><span class="ͼt">length</span><span></span><span class="ͼn">-</span><span></span><span class="ͼq">1</span><span>;</span><br/><br/><span class="ͼn">while</span><span>(</span><span class="ͼt">start</span><span></span><span class="ͼn"><=</span><span></span><span class="ͼt">end</span><span>){</span><br/><br/><span></span><span class="ͼt">int</span><span></span><span class="ͼt">mid</span><span></span><span class="ͼn">=</span><span> (</span><span class="ͼt">start</span><span></span><span class="ͼn">+</span><span></span><span class="ͼt">end</span><span>) </span><span class="ͼn">/</span><span></span><span class="ͼq">2</span><span>;</span><br/><br/><span></span><span class="ͼn">if</span><span>(</span><span class="ͼt">arr</span><span>[</span><span class="ͼt">mid</span><span>] </span><span class="ͼn">==</span><span></span><span class="ͼt">target</span><span>)</span><br/><span></span><span class="ͼn">return</span><span></span><span class="ͼt">mid</span><span>;</span><br/><br/><span></span><span class="ͼn">else</span><span></span><span class="ͼn">if</span><span>(</span><span class="ͼt">target</span><span></span><span class="ͼn">></span><span></span><span class="ͼt">arr</span><span>[</span><span class="ͼt">mid</span><span>])</span><br/><span></span><span class="ͼt">start</span><span></span><span class="ͼn">=</span><span></span><span class="ͼt">mid</span><span></span><span class="ͼn">+</span><span></span><span class="ͼq">1</span><span>;</span><br/><br/><span></span><span class="ͼn">else</span><br/><span></span><span class="ͼt">end</span><span></span><span class="ͼn">=</span><span></span><span class="ͼt">mid</span><span></span><span class="ͼn">-</span><span></span><span class="ͼq">1</span><span>;</span><br/><span>}</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

---

# 🧠 One-line memory trick

**Binary Search Rule**

<pre class="overflow-visible! px-0!" data-start="1887" data-end="1974"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>start, end → index</span><br/><span>mid → index</span><br/><span>compare → arr[mid]</span><br/><span>move → mid ± 1</span><br/><span>array → sorted</span></div></div></div></div></div></div></div></div></div></div></div></div></pre>
